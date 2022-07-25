package net.verox.arclight.entity.armor;

import net.verox.arclight.item.ArclightArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MoonlightArmorRenderer extends GeoArmorRenderer<ArclightArmorItem> {
    public MoonlightArmorRenderer() {
        super(new MoonlightArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorRightLeg";
        this.leftLegBone = "armorLeftLeg";
        this.rightBootBone = "armorRightBoots";
        this.leftBootBone = "armorLeftBoots";

    }
}
