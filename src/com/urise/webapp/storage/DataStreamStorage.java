package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.io.File;
import java.util.List;

public class DataStreamStorage extends AbstractStorage<File> {
    protected final File directory;

    public DataStreamStorage(String path) {
        directory = new File(path);
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException(path + " is not directory");
        }
    }

    @Override
    protected File getSearchKey(String uuid) {
        return new File(directory, uuid);
    }

    @Override
    protected boolean isExist(File file) {
        return file.exists();
    }

    @Override
    public void clear() {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                doDelete(file);
            }
        }
    }

    @Override
    protected void doUpdate(Resume r, File file) {
    }

    @Override
    protected void doSave(Resume r, File file) {
    }

    @Override
    protected Resume doGet(File file) {
        return null;
    }

    @Override
    protected void doDelete(File file) {
        if (!file.delete()) {
            throw new StorageException("File delete error", file.getName());
        }
    }

    @Override
    // TODO implements
    protected List<Resume> doCopyAll() {
        return null;
    }

    @Override
    // TODO implements
    public int size() {
        return 0;
    }
}
