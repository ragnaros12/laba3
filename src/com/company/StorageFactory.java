package com.company;

import com.company.interfaces.Person;

public abstract class StorageFactory implements Person {
    public abstract boolean hasNext(GlobalState state);
    public abstract void reset();
}
