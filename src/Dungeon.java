import java.util.List;
import java.util.ArrayList;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;
    private List<Trap> traps;
    private List<Treasure> treasures;
    private List<SecretPassage> secretPassages;

    public Dungeon(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.npcs = new ArrayList<>();
        this.traps = new ArrayList<>();
        this.treasures = new ArrayList<>();
        this.secretPassages = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addNPC(NPC npc) {
        npcs.add(npc);
    }

    public void addTrap(Trap trap) {
        traps.add(trap);
    }

    public void addTreasure(Treasure treasure) {
        treasures.add(treasure);
    }

    public void addSecretPassage(SecretPassage secretPassage) {
        secretPassages.add(secretPassage);
    }

    public void showDungeonInfo() {
        System.out.println("Dungeon: " + name);
        System.out.println("\nRooms:");
        for (Room room : rooms) {
            System.out.println("- " + room.getName());
        }
        System.out.println("\nNPCs:");
        for (NPC npc : npcs) {
            System.out.println("- " + npc.getName());
        }
        System.out.println("\nTraps:");
        for (Trap trap : traps) {
            System.out.println("- " + trap.getType());
        }
        System.out.println("\nTreasures:");
        for (Treasure treasure : treasures) {
            System.out.println("- " + treasure.getName());
        }
        System.out.println("\nSecret Passages:");
        for (SecretPassage passage : secretPassages) {
            System.out.println("- " + passage.getName());
        }
    }
}
