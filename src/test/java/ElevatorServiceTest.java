import loger.TestLogger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class ElevatorServiceTest extends AbstractUnitTest {
    TestLogger log = new TestLogger();
    ElevatorService elevatorService = new ElevatorService(log);

    @Test
    public void moving() throws InterruptedException {
        User first = new User();
        first.setName("First");
        first.setDestination(4L);
        first.setLocation(1L);
        first.setStatus(UserStatus.CAUSED);

        User second = new User();
        second.setName("Second");
        second.setDestination(3L);
        second.setLocation(2L);
        second.setStatus(UserStatus.CAUSED);

        User third = new User();
        third.setName("Third");
        third.setDestination(1L);
        third.setLocation(4L);
        third.setStatus(UserStatus.CAUSED);

        List<User> users = new ArrayList<User>();
        users.add(first);
        users.add(second);
        users.add(third);

        Elevator elevator = new Elevator();
        elevator.setDirection(Direction.UP);
        elevator.setLocation(1L);
        elevator.setFloorStopEnterToElevator(new HashSet<>(Arrays.asList(1L, 2L, 4L)));

        elevatorService.moving(elevator, users);
        assertTrue(log.getList().size() == 17);


    }
}

