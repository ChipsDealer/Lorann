package model.mobileLess;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 * Test the method from the Package Model.MobileLess
 * @author Pierre Baudot
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ BadDoorTest.class, BasicGroundTest.class, EnergicBubbleTest.class, KindDoorTest.class,
		LateralBoneTest.class, MotionLessFactoryTest.class, TreasureTest.class,
		VerticalBoneTest.class, WallCornerTest.class })
public class AllTests {

}
