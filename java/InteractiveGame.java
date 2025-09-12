import java.util.ArrayList;
import java.util.Scanner;

// Abstract class (Abstraction)
abstract class Character {
    protected String name;

    public Character(String name) {
        this.name = name;
    }

    abstract void attack();
}

// Enemy class (Inheritance + Overriding)
class Enemy extends Character {
    public Enemy(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with claws!");
    }
}

// BossEnemy class (Inheritance + Overriding)
class BossEnemy extends Enemy {
    public BossEnemy(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " unleashes a deadly fireball!");
    }
}

// GameLevel class
class GameLevel {
    private int levelNumber;
    private String theme;
    private boolean bossLevel;
    private int difficulty;
    private ArrayList<Enemy> enemies;
    static int totalLevels = 0;

    // Default constructor
    public GameLevel() {
        this.levelNumber = 1;
        this.theme = "Tutorial";
        this.bossLevel = false;
        this.difficulty = 1;
        this.enemies = new ArrayList<>();
        totalLevels++;
    }

    // Parameterized constructor
    public GameLevel(int levelNumber, String theme, boolean bossLevel) {
        this.levelNumber = levelNumber;
        this.theme = theme;
        this.bossLevel = bossLevel;
        this.difficulty = calculateDifficulty();
        this.enemies = new ArrayList<>();
        totalLevels++;
    }

    // Method Overloading (Compile-time Polymorphism)
    public void addEnemy(String name) {
        enemies.add(new Enemy(name));
    }

    public void addEnemy(String name, boolean isBoss) {
        if (isBoss) {
            enemies.add(new BossEnemy(name));
        } else {
            enemies.add(new Enemy(name));
        }
    }

    // Generate enemies
    public void generateEnemies() {
        for (int i = 1; i <= difficulty; i++) {
            addEnemy("Enemy_" + i);
        }
        if (bossLevel) {
            addEnemy("BossEnemy", true);
        }
    }

    // Fight enemies interactively
    public void startBattle(Scanner sc) {
        System.out.println("\n⚔️ Entering Level " + levelNumber + " (" + theme + ")");
        for (Enemy e : enemies) {
            System.out.println("\nA wild " + e.name + " appears!");
            boolean defeated = false;

            // fight loop
            while (!defeated) {
                System.out.println("Choose action: 1.Attack  2.Defend  3.Run");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("You attack " + e.name + " and defeat it!");
                        defeated = true;
                        break;
                    case 2:
                        System.out.println("You defend. " + e.name + " tries to attack...");
                        e.attack(); // runtime polymorphism
                        break;
                    case 3:
                        System.out.println("You ran away! Game Over.");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        }
        System.out.println("\n✅ Level " + levelNumber + " Cleared!");
    }

    // Calculate difficulty
    private int calculateDifficulty() {
        int diff = levelNumber;
        if (levelNumber % 5 == 0) diff += 2;
        switch (theme.toLowerCase()) {
            case "forest": diff += 1; break;
            case "desert": diff += 2; break;
            case "volcano": diff += 3; break;
            default: diff += 1;
        }
        if (bossLevel) diff += 2;
        return diff;
    }
}

public class InteractiveGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1D Array (Themes)
        String[] themes = {"Forest", "Desert", "Volcano"};

        System.out.print("Enter your name: ");
        String player = sc.nextLine();
        System.out.println("\nWelcome, " + player + "!");

        boolean playing = true;
        while (playing) {
            System.out.println("\n=== Game Menu ===");
            System.out.println("1. Play a Level");
            System.out.println("2. Exit Game");
            System.out.print("Choose: ");
            int menu = sc.nextInt();

            if (menu == 1) {
                System.out.println("\nChoose Theme:");
                for (int i = 0; i < themes.length; i++) {
                    System.out.println((i + 1) + ". " + themes[i]);
                }
                int choice = sc.nextInt();

                String chosenTheme = themes[choice - 1];
                boolean boss = (choice == 3); // Volcano always boss

                GameLevel level = new GameLevel(5, chosenTheme, boss);
                level.generateEnemies();
                level.startBattle(sc);

            } else if (menu == 2) {
                playing = false;
                System.out.println("👋 Thanks for playing!");
            } else {
                System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
