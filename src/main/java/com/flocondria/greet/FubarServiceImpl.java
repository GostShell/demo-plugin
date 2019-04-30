package com.flocondria.greet;

import com.evergarden.sdk.database.Migration;
import org.jooq.DSLContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(service = Migration.class, name = "MySuperService", immediate = true)
public class FubarServiceImpl implements Fubar, Migration {

    @Activate
    public void turnOn()
    {
        System.out.println("FubarService activated!");
    }

    @Override
    public void sayHello()
    {
        System.out.println("Hello World!");
    }

    @Override
    public void execute(DSLContext jooq) {
        System.out.println("Execute something relative to jooq");
    }

    @Override
    public void execute(String text) {
        System.out.println("Execute something relative to jooq");
        System.out.println(text);
    }
}
