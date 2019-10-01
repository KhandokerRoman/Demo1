package Demo1

class Character {
  def wizard (
  val attack = 60 : Int;
    val defense = 50: Int;
    val magicAttack = 70 : Int;
    val magicDefense = 60: Int;
    val maxHP = 80 : Int;
    var currentHP = 65:Int;
    val maxMP = 60 : Int;
    var currentMP = 50 : Int;
    var levelUp = 100 : Int;
     var spells = 120 : Int;
    var isDead :Boolean = false )
  {
    def takeDamage(damage: Int ):Unit=
    {
      currentHP -= damage
      if (currentHP <= 0)
      {
        isDead=true
      }
    }
    def attack(defender:Character):Unit=
    {
      defender.takeDamage(attack - defender.defender)
    }
    def magicAttack(defender:Character):Unit=
    {
      if(currentMP>=5)
      {
        defender.takeDamage(magicAttack-defender.magicAttack)
        currentMP-=5
      }
      def levelUp(damage: Int):Unit = {
     currentHP += damage
        if (currentHP >=10)
          {
            levelUp= true
          }
      }

    }

  }

  def attacker(
  val attack = 80 : Int;
  val defense = 60: Int;
  val magicAttack = 80 : Int;
  val magicDefense = 70: Int;
  val maxHP = 90 : Int;
  var currentHP = 75:Int;
  val maxMP = 70 : Int;
  var currentMP = 60 : Int;
  var levelUp = 110 : Int;
  var spells = 150 : Int;
  var isDead :Boolean = false )
  {
    def takeDamage(damage: Int ):Unit=
    {
      currentHP -= damage
      if (currentHP <= 0)
      {
        isDead=true
      }
    }
    def attack(defender:Character):Unit=
    {
      defender.takeDamage(attack - defender.defender)
    }
    def magicAttack(defender:Character):Unit=
    {
      if(currentMP>=5)
      {
        defender.takeDamage(magicAttack-defender.magicAttack)
        currentMP-=5
      }
      def levelUp(damage: Int):Unit = {
        currentHP += damage
        if (currentHP >=10)
        {
          levelUp= true
        }
      }

    }

  }

}
