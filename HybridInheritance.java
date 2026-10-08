// HybridInheritance.java

interface Sports {
    void play();
}

class Student {
    void study() {
        System.out.println("Student studies");
    }
}

class CollegeStudent extends Student {
    void attendCollege() {
        System.out.println("Student attends college");
    }
}

class Player extends CollegeStudent implements Sports {
    @Override
    public void play() {
        System.out.println("Student plays sports");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Player player = new Player();

        player.study();
        player.attendCollege();
        player.play();
    }
}