/**
 * Array based storage for Resumes
 */

// jgfcvkblkjbkjvjfujvjh
public class ArrayStorage {
    Resume[] storage = new Resume[100000];
    int size = 0;

    void clear() {
        for (int i = 0; i < size; i++) {
            storage[i] = null;
        }
        size = 0;
    }

    void save(Resume r) {
        storage[size++] = r;

    }

    Resume get(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid == storage[i].uuid) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (uuid.equals(storage[i].uuid)) {
                storage[i] = null;
                for (int j = 0; j < size - i - 1; j++) {
                    storage[j + i] = storage[j + i + 1];
                }
                break;
            }
        }
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] storage1 = new Resume[size];
        for (int i = 0; i < size; i++) {
            storage1[i] = storage[i];
        }
        return storage1;
    }

    int size() {
        return size;
    }

}
