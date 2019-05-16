import Game.Rooms.Enemy;
import Game.Rooms.Room;
import Game.Rooms.Treasure;
import Game.Rooms.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

   Room room;
   Room room2;
   Treasure treasure;
   Enemy enemy;

   @Before
   public void Before() {
       treasure = new Treasure(TreasureType.DRAGONGLASS);
       enemy = new Enemy("Cave Troll", 250, 100);
       room = new Room("Dungeon", treasure);
       room2 = new Room("Cave", enemy);

   }

   @Test
    public void hasTreasure() {
       assertEquals(treasure, room.getTreasure());
   }

   @Test
    public void hasEnemy() {
       assertEquals(enemy, room2.getEnemy());
   }
}
