package com.cecurity.app1.interfaces.shell;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

@ShellComponent
public class JdbcCommands {
    private final JdbcTemplate jdbcTemplate;
    private final static Logger log = LoggerFactory.getLogger( JdbcCommands.class );
    public JdbcCommands( JdbcTemplate jdbcTemplate ) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @ShellMethod( "Display mane length of a given profile by nickname" )
    public String manelength( String nickname ) {

        String sql = "SELECT manelength FROM Profile WHERE nickname = ?";
        List<Integer> lengths = jdbcTemplate.queryForList( sql, Integer.class,
                nickname );
        log.info("sql = {}",sql);
        return lengths.isEmpty() ? "Unknown profile for nickname " + nickname
                : "Length is " + lengths.getFirst().toString();
    }
}