package kozak.time

import kozak.time.TimeImplicits._

class TimeTest extends org.scalatest.FunSpec {

  describe("time"){
    it("should return number of hours in seconds"){
      assert(1.hour === 3600)
      assert(2.hours === 7200)
    }

    it("should convert minutes to seconds") {
      assert(1.minute === 60)
      assert(2.minutes === 120)
    }

    it("should not convert seconds") {
      assert(1.second === 1)
      assert(5.seconds === 5)
    }

    it("should add hours, minutes, and seconds together"){
      assert(1.hour.and(2.hours) === 10800)
      assert(1.hour.and(1.minute.and(1.second)).and(9.seconds) === 3670)
    }

  }

}