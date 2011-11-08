package org.anddev.andengine.util.path.astar;

import junit.framework.Assert;
import junit.framework.TestCase;

import org.anddev.andengine.util.path.ICostFunction;
import org.anddev.andengine.util.path.IPathFinderMap;
import org.anddev.andengine.util.path.Path;

/**
 * @author Nicolas Gramlich
 * @since 10:34:13 - 17.08.2010
 */
public class AStarPathFinderTest extends TestCase {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Test-Methods
	// ===========================================================

	public void testSimplePath() throws Exception {
		final AStarPathFinder<Object> aStarPathFinder = new AStarPathFinder<Object>(0, 0, 2, 2, false);
		
		final Path path = aStarPathFinder.findPath(0, 0, 2, 2, new Object(), new IPathFinderMap<Object>() {
			@Override
			public boolean isBlocked(int pX, int pY, Object pEntity) {
				return false;
			}
		}, new ICostFunction<Object>() {
			@Override
			public float getCost(IPathFinderMap<Object> pPathFinderMap, int pFromX, int pFromY, int pToX, int pToY, Object pEntity) {
				return 1;
			}
		});
		Assert.assertEquals(5, path.getLength());
	}
	
	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
