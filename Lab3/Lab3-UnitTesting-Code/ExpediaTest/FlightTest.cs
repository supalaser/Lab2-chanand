using System;
using Expedia;
using NUnit.Framework;

namespace ExpediaTest
{
	[TestFixture()]
	public class FlightTest
	{
		[Test()]
        public void TestThatFlightInitialize()
        {
            var target = new Flight(new DateTime(2010,1,2), new DateTime(2010,1,3), 1000);
            Assert.IsNotNull(target);
        }
        [Test()]
        [ExpectedException(typeof(InvalidOperationException))]
        public void TestInvalidTimes()
        {
            var target = new Flight(new DateTime(2010, 1, 3), new DateTime(2010, 1, 2), 1000);
        }
        [Test()]
        [ExpectedException(typeof(ArgumentOutOfRangeException))]
        public void TestNegMiles()
        {
            var target = new Flight(new DateTime(2010, 1, 2), new DateTime(2010, 1, 3), -1000);
        }
        [Test()]
        public void TestEqual()
        {
            var target = new Flight(new DateTime(2010, 1, 2), new DateTime(2010, 1, 3), 1000);
            var target2 = new Flight(new DateTime(2010, 1, 2), new DateTime(2010, 1, 3), 1000);
            Assert.AreEqual(target, target2);
        }
        
    
    }
}
