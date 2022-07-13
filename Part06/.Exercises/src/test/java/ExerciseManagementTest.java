
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class ExerciseManagementTest {
    
    private ExerciseManagement managementTest;
    
    @Before
    public void initialize() {
        managementTest = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeggining() {        
        assertEquals(0, managementTest.exerciseList().size());
    }
    
    @Test
    public void addingExerciseGrowsListByOne() {
        managementTest.add("Write a test");
        assertEquals(1, managementTest.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList() {
        managementTest.add("Write a test");
        assertTrue(managementTest.exerciseList().contains("Write a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        managementTest.add("Write a test");
        managementTest.markAsCompleted("Write a test");
        assertTrue(managementTest.isCompleted("Write a test"));
    }    
    
    @Test 
    public void ifNotMarkedCompletedIsNotCompleted() {
        managementTest.add("New exercise");
        managementTest.markAsCompleted("New exercise");
        assertFalse(managementTest.isCompleted("Some exercise"));
    }

}
