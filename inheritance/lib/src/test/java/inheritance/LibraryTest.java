/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
    @Test void testingAddReviewOnRestaurant(){
        // Arrange
        Review testReview = new Review("Good halal spot", "Sharmarke", 4);

        Restaurant testRestaurant = new Restaurant("Maza Grill", "$$");
        // Act
        testRestaurant.addReview(testReview);
        // Assert
        assertTrue(testRestaurant.getReviews().contains(testReview));
        assertFalse(testRestaurant.getReviews().isEmpty());
        assertEquals(testReview.getNumOfStars(), testRestaurant.getNumOfStars());
    }

    // Constructor tests
    @Test void testingReviewConstructor(){
        // Arrange
        // Act
        Review testReview = new Review("Body", "Author", 5);
        // Assert
        assertEquals("Body", testReview.getText());
        assertEquals("Author", testReview.getAuthor());
        assertEquals(5, testReview.getNumOfStars());
    }

    @Test void testingAddReviewOnShop(){
        // Arrange
        Review testReview = new Review("Good shopping spot", "Sharmarke", 4);
        Shop testShop = new Shop("Costco", "Good place for pretty much anything", "$$$");
        // Act
        testShop.addReview(testReview);
        // Arrange
        assertTrue(testShop.getReviews().contains(testReview));
        assertFalse(testShop.getReviews().isEmpty());
    }

    @Test void testingAddReviewOnMovie(){
        // Arrange
        Review testReview = new Review("Legendary Movie", "Sharmarke", 5);
         Theater testMovie = new Theater("Lion King");
        // Act
        testMovie.addReview(testReview);
        // Arrange
        assertTrue(testMovie.getReviews().contains(testReview));
        assertFalse(testMovie.getReviews().isEmpty());
    }
}
