/**
 * 
 */
package unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import geometries.Plane;
import primitives.Point3D;
import primitives.Vector;

/**
 * @author mgaru
 *
 */
public class PlanTest {

	/**
	 * Test method for {@link geometries.Plane#Plane(primitives.Point3D, primitives.Point3D, primitives.Point3D)}.
	 */
	
	@Test
	public void testConstructor() {
		
        // =============== Boundary Values Tests ==================

		
		// case 1 tow first points are the same
				
		try {
			Plane p3 = new Plane(new Point3D(0.0, 1.0, 0.0), new Point3D(0.0, 1.0, 0.0),
					new Point3D(1.0, 0.0, 0.0));

		}catch (IllegalArgumentException e){
			fail("Failed constructing a correct Plane");
		}
		//case 2 - 
		
		try {
			Plane p2 = new Plane(new Point3D(0.0, 1.0, 0.0), new Point3D(0.0, 2.0,0.0),
					new Point3D(0.0, 3.0, 0.0));
			fail("case 2: constructed wrong plane");
		}catch (IllegalArgumentException e){
			
		}
		
		
	}
	
	@Test
	public void testGetNormal() {
		// ============ Equivalence Partitions Tests ==============
		
		//case 1
		Plane p1 = new Plane(new Point3D(0.0, 1.0, 1.0), new Point3D(0.0, 0.0, 1.0), new Point3D(0.0, 1.0, 0.0));
		Vector ans1 = new Vector(1.0,0.0,0.0);
		assertTrue(ans1.equals(p1.getNormal()));
		
		//case 2
		Plane p2 = new Plane(new Point3D(1.0, 0.0, 0.0), new Point3D(0.0, 1.0, 0.0), new Point3D(0.0, 1.0, 1.0));
		Vector ans2 = new Vector(1.0,-1.0,1.0);
		assertTrue(ans2.equals(p2.getNormal()));
	}
}