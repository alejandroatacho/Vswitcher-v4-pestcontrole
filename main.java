if(v.getWalking().nearEntity(Entity.GAME, 25632, 1))  {
                             GameObject gameObject = v.getGameObject().findNearest(25632);
                    if (gameObject != null) {
                int gameObjectSceneX = gameObject.getSceneMinLocation().getX();
                int gameObjectSceneY = gameObject.getSceneMinLocation().getY();
        v.invoke("Cross","<col=ffff>Gangplank",25632,3,gameObjectSceneX,gameObjectSceneY,false);
 }
}
int[] npcIds = {1701,1702,1700,1703};
if(v.getLocalPlayer().hasAnimation(-1)) {
    NPC npc = (NPC) v.getCombat().npcTarget();
    if (npc == null) {
        NPC shifter = v.getNpc().findNearest(1701,1702,1700,1703);
        if (shifter != null) {
            v.getCombat().attackNpc(shifter);
        }
    }
}