public class MUDBuilderDemo {
    public static void main(String[] args) {
        Room room1 = new Room("Entrance Hall");
        Room room2 = new Room("Treasure Room");
        Room room3 = new Room("Boss Chamber");

        // Создаём NPC
        NPC goblin = new NPC("Goblin Guard");
        NPC dragon = new NPC("Fire Dragon");

        // Создаём ловушки
        Trap poisonArrows = new Trap("Poison Arrows");
        Trap firePit = new Trap("Fire Pit");

        // Создаём сокровища
        Treasure goldChest = new Treasure("Golden Chest");
        Treasure magicRing = new Treasure("Ring of Power");

        // Создаём секретные проходы
        SecretPassage hiddenDoor = new SecretPassage("Hidden Door behind the Statue");
        SecretPassage undergroundTunnel = new SecretPassage("Underground Tunnel to Escape");

        // Создаём подземелье с помощью Builder
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Caverns")
                .addRoom(room1)
                .addRoom(room2)
                .addRoom(room3)
                .addNPC(goblin)
                .addNPC(dragon)
                .addTrap(poisonArrows)
                .addTrap(firePit)
                .addTreasure(goldChest)
                .addTreasure(magicRing)
                .addSecretPassage(hiddenDoor)
                .addSecretPassage(undergroundTunnel)
                .build();

        dungeon.showDungeonInfo();
    }
}
