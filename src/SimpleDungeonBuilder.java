public class SimpleDungeonBuilder implements IDungeonBuilder {
    private Dungeon dungeon;

    public SimpleDungeonBuilder() {
        this.dungeon = new Dungeon("Unnamed Dungeon");
    }

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.dungeon = new Dungeon(name);
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        dungeon.addRoom(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        dungeon.addNPC(npc);
        return this;
    }

    @Override
    public IDungeonBuilder addTrap(Trap trap) {
        dungeon.addTrap(trap);
        return this;
    }

    @Override
    public IDungeonBuilder addTreasure(Treasure treasure) {
        dungeon.addTreasure(treasure);
        return this;
    }

    @Override
    public IDungeonBuilder addSecretPassage(SecretPassage secretPassage) {
        dungeon.addSecretPassage(secretPassage);
        return this;
    }

    @Override
    public Dungeon build() {
        return dungeon;
    }
}


