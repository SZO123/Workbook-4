import com.pluralsight.hoteloperations.Room;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    private Room room;

    @BeforeEach
    void setUp() {

        room = new Room(2, false, false, 150.0);
    }

    @Test
    void testCheckInMarksRoomOccupiedAndDirty() {
        room.checkIn();
        assertTrue(room.isOccupied(), "Room should be occupied after check-in.");
        assertTrue(room.isDirty(), "Room should be dirty after check-in.");
    }

    @Test
    void testCheckOutMarksRoomNotOccupied() {
        room.checkIn();
        room.checkOut();
        assertFalse(room.isOccupied(), "Room should not be occupied after check-out.");
    }

    @Test
    void testCleanRoomMarksRoomNotDirty() {
        room.checkIn();
        room.checkOut();
        room.cleanRoom();
        assertFalse(room.isDirty(), "Room should not be dirty after cleaning.");
    }

    @Test
    void testCannotCheckInIfRoomAlreadyOccupied() {
        room.checkIn();
        assertFalse(room.checkIn(), "Cannot check in a room that's already occupied.");
    }

    @Test
    void testCannotCleanRoomIfOccupied() {
        room.checkIn();
        assertFalse(room.cleanRoom(), "Cannot clean a room that's currently occupied.");
    }
}