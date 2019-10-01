package Demo1
  import org.scalaest._
  import Demo1.Character
  class TestDemo1 extends FunSuite {
    test(testName = "Testing Damage")
    {
      var test = new Character()
      test.takeDamage(damage = 20)
      assert(test.currentHP == 60,test.currentHP)
      assert(test.isDead == false,test.isDead)
      test.takeDamage(damage = 100)
      assert(test.isDead == true,test.isDead)
    }
    test(testName="Testing Attack")
    {
      var attack= new Character()
      var defender=new character()
      attacker.attack(defender)
      assert(defender.currentHP == 80,defender.currentHP)
      attacker.magicAttack(defender)
      assert(defender.currentHP == 75,defender.currentHP)
      attacker.currentMP=0
      attacker.magicAttack(defender)
      assert(defender.currentHP == 70,defender.currentHP)
    }
    test(testName = "Testing battleOption")
    {
      var test = new Character()
      test.gainPoint(point == 1500)
      assert(test.currentHP == 80,test.experience)
      assert(test.gainExperience == true,test.experience)
      test.gainPoint(point == 1500)
      assert(test.currentMP == 100,test.experience)
      assert(test.gainlevel == true,test.level)
      if (test.gainExperience == 1500)
        assert(test.gainlevel == Double,test.level)
    }



}
