package com.flocondria.greet;

import com.evergarden.sdk.database.Migration;
import org.jooq.DSLContext;
import org.jooq.impl.SQLDataType;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Greeting implements BundleActivator {

    @Override
    public void start(BundleContext context) throws Exception {
        System.out.println("The bundle is starting");
        greet();
        context.registerService(Migration.class, new FubarServiceImpl(), null);

//        ServiceReference reference = context.getServiceReference(DSLContext.class);
//        DSLContext jooq = (DSLContext) context.getService(reference);
//        jooq.createTable("JooqDemoPluginTable")
//            .column("FirstColumn", SQLDataType.VARCHAR(25).nullable(false))
//            .execute();

    }

    @Override
    public void stop(BundleContext context) throws Exception {
        System.out.println("The bundle is stopping");
    }

    public void greet() {
        System.out.println("Greetinnnnnnnnnnnng !!! yato");
    }
}
