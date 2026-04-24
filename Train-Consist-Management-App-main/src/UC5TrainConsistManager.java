import java.util.LinkedHashSet;
import java.util.Set;

class Bogie {
    private String id;
    private String type;

    public Bogie(String id, String type) {
        this.id = id;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bogie bogie = (Bogie) o;
        return id.equals(bogie.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Bogie{id='" + id + "', type='" + type + "'}";
    }
}

 class UC5TrainConsistManager {
    private Set<Bogie> bogies;

    public UC5TrainConsistManager() {
        this.bogies = new LinkedHashSet<>();
    }

    public void addBogie(Bogie bogie) {
        bogies.add(bogie);
    }

    public void removeBogie(Bogie bogie) {
        bogies.remove(bogie);
    }

    public void displayConsist() {
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        UC4TrainConsistManager manager = new UC4TrainConsistManager();
        manager.addBogie(new Bogie("B001", "Sleeper"));
        manager.addBogie(new Bogie("B002", "AC Chair"));
        manager.addBogie(new Bogie("B003", "First Class"));
        manager.addBogie(new Bogie("B001", "Sleeper"));

        manager.displayConsist();
    }
}
