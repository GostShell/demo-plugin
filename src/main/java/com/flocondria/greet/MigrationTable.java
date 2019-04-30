package com.flocondria.greet;

import com.evergarden.sdk.database.Migration;
import org.jooq.DSLContext;
import org.jooq.impl.SQLDataType;

public class MigrationTable implements Migration {

    public void execute(DSLContext jooq) {
        jooq.createTable("JooqDemoPluginTable")
            .column("FirstColumn", SQLDataType.VARCHAR(25).nullable(false))
            .execute();
    }

    @Override
    public void execute(String text) {

    }
}
