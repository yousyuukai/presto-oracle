package com.facebook.presto.plugin.oracle;

import com.facebook.presto.plugin.jdbc.JdbcPlugin;

public class OraclePlugin
        extends JdbcPlugin
{
    public OraclePlugin()
    {
        super("oracle", new OracleClientModule());
    }
}