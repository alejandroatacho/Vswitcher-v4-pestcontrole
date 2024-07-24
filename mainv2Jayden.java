//Set the difficulty of pest control game.
// 25632 = Veteran
// 25631 = Intermediate
// 14315 = Beginner
int difficulty = 25632;

//Crosses the Gangplank onto the boat. Make sure you are standing next to the gangplank when you start the script
if(v.getWalking().nearEntity(Entity.GAME, difficulty, 1))  {
                             GameObject gameObject = v.getGameObject().findNearest(difficulty);
                    if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
        v.invoke("Cross","<col=ffff>Gangplank",difficulty,3,gameObjectSceneX,gameObjectSceneY,false);
 }
}
//These are the ID's for the [Shifter] minion, these teleport to the middle so easiest to target.
int[] npcIds = {1694,1695,1696,1699,1698,1697,1701,1702,1700,1703};
if(v.getLocalPlayer().hasAnimation(-1)) {
    NPC npc = (NPC) v.getCombat().npcTarget();
    if (npc == null) {
        NPC shifter = v.getNpc().findNearest(1694,1695,1696,1699,1698,1697,1701,1702,1700,1703);
        if (shifter != null) {
            v.getCombat().attackNpc(shifter);
        }
    }
  }
