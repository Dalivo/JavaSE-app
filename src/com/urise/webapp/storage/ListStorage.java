package com.urise.webapp.storage;


import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public abstract class ListStorage extends AbstractStorage  {

    protected ArrayList<Resume> storage = new ArrayList<>();

    protected int getIndex(String uuid) {
        return storage.indexOf(uuid);
    }

}
