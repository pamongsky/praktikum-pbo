package jdbc.service;

import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;

public class MysqlMahasiswaService {
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public MysqlMahasiswaService() {
        // Initialize with some data
        mahasiswaList.add(new Mahasiswa(1, "Nina"));
        mahasiswaList.add(new Mahasiswa(2, "Rudi"));
        mahasiswaList.add(new Mahasiswa(3, "Beni"));
    }

    public void add(Mahasiswa mhs) {
        mahasiswaList.add(mhs);
    }

    public void update(Mahasiswa mhs) {
        for (Mahasiswa existingMhs : mahasiswaList) {
            if (existingMhs.getId() == mhs.getId()) {
                existingMhs.setNama(mhs.getNama());
                break;
            }
        }
    }

    public void delete(int id) {
        mahasiswaList.removeIf(mhs -> mhs.getId() == id);
    }

    public Mahasiswa getById(int id) {
        for (Mahasiswa mhs : mahasiswaList) {
            if (mhs.getId() == id) {
                return mhs;
            }
        }
        return null;
    }

    public List<Mahasiswa> getAll() {
        return new ArrayList<>(mahasiswaList);
    }
}
