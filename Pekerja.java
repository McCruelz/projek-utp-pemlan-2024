import java.time.LocalDate;

public class Pekerja {
    private String nama;
    private boolean gender;
    private LocalDate dob;
    private double pendapatan;
    private LocalDate tglMasuk;
    private String project;

    Pekerja(String nama, boolean gender, LocalDate dob, double pendapatan, LocalDate tglMasuk, String project){
        this.nama = nama;
        this.gender = gender;
        this.dob = dob;
        this.pendapatan = pendapatan;
        this.tglMasuk = tglMasuk;
        this.project = project;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public LocalDate getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(LocalDate tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    
}
