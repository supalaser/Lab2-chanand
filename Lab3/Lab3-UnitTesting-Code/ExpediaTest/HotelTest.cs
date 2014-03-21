using System;
using Expedia;
using NUnit.Framework;

namespace ExpediaTest
{
    

    [TestFixture()]
    public class HotelTest
    {
		//TODO Task 6 items go here
        private readonly int NightsToRentHotel = 5;
        [Test()]
        public void ThatThatHotelInitialize()
        {
            var target = new Hotel(NightsToRentHotel);
            Assert.IsNotNull(target);
        }
        [Test()]
        public void TestThatHotelHasCorrectBasePriceForOneDayStay()
        {
            var target = new Hotel(1);
            Assert.AreEqual(45, target.getBasePrice());
        }
        [Test()]
        public void TestThatHotelHasCorrectBasePriceForTwoDayStay()
        {
            var target = new Hotel(2);
            Assert.AreEqual(90, target.getBasePrice());
        }
        [Test()]
        public void TestThatHotelHasCorrectBasePriceForTenDaysStay()
        {
            var target = new Hotel(10);
            Assert.AreEqual(450, target.getBasePrice());
        }
        [Test()]
        [ExpectedException(typeof(ArgumentOutOfRangeException))]
        public void TestThatHotelThrowsOnBadLength()
        {
            new Hotel(-5);
        }
    }
}