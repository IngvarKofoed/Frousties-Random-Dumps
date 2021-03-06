package com.randomdumps.mod.mobs.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Chocobo by Frousties
 */
@SideOnly(Side.CLIENT)
public class ModelChocobo extends ModelBase {
    public ModelRenderer Shape1;
    public ModelRenderer Shape2;
    public ModelRenderer Shape3;
    public ModelRenderer Shape4;
    public ModelRenderer ClawRight12;
    public ModelRenderer ClawRight22;
    public ModelRenderer ClawLeft1;
    public ModelRenderer ClawLeft2;
    public ModelRenderer ClawRight11;
    public ModelRenderer ClawRight21;
    public ModelRenderer Head;
    public ModelRenderer Beak;
    public ModelRenderer HeadFeathers;
    public ModelRenderer HeadFeathers2;
    public ModelRenderer HeadFeathers3;
    public ModelRenderer Wing;
    public ModelRenderer Wing2;
    public ModelRenderer TailBase;
    public ModelRenderer TailBase2;
    public ModelRenderer TailFeather3;
    public ModelRenderer UpperRightLeg;
    public ModelRenderer LowRightLeg;
    public ModelRenderer ClawBackRight1;
    public ModelRenderer ClawBackRight2;
    public ModelRenderer UpperLeftLeg;
    public ModelRenderer LowLeftLeg;
    public ModelRenderer ClawBackLeft1;
    public ModelRenderer ClawBackLeft2;
    public ModelRenderer ClawFrontRightLeft1;
    public ModelRenderer ClawFrontRightLeft2;

    public ModelChocobo() {
        this.textureWidth = 96;
        this.textureHeight = 96;

        this.Shape1 = new ModelRenderer(this, 24, 40);
        this.Shape1.setRotationPoint(-3.0F, -20.4F, -7.0F);
        this.Shape1.addBox(-7.0F, 0.0F, 0.0F, 12, 9, 15);
        this.setRotation(this.Shape1, 0.12217304763960307F, 0.0F, 0.0F);
        this.Shape2 = new ModelRenderer(this, 31, 25);
        this.Shape2.setRotationPoint(-4.0F, -22.4F, -7.0F);
        this.Shape2.addBox(-5.0F, 0.0F, 0.0F, 10, 7, 8);
        this.setRotation(this.Shape2, -0.6981317007977318F, 0.0F, 0.0F);
        this.Shape3 = new ModelRenderer(this, 0, 52);
        this.Shape3.setRotationPoint(-4.0F, -31.4F, -10.0F);
        this.Shape3.addBox(-3.0F, 0.0F, 0.0F, 6, 14, 6);
        this.setRotation(this.Shape3, -0.08726646259971647F, 0.0F, 0.0F);
        this.Shape4 = new ModelRenderer(this, 6, 43);
        this.Shape4.setRotationPoint(-4.0F, -34.4F, -7.6F);
        this.Shape4.addBox(-3.0F, 0.0F, 0.0F, 6, 4, 5);
        this.setRotation(this.Shape4, -0.7853981633974483F, 0.0F, 0.0F);
        this.ClawRight12 = new ModelRenderer(this, 24, 6);
        this.ClawRight12.setRotationPoint(-0.8F, -0.39999962F, 3.6F);
        this.ClawRight12.addBox(-1.0F, 0.0F, -4.0F, 1, 1, 4);
        this.setRotation(this.ClawRight12, 0.0F, 0.3490658503988659F, 0.0F);
        this.ClawRight22 = new ModelRenderer(this, 26, 2);
        this.ClawRight22.setRotationPoint(-1.0F, -0.39999962F, 3.0F);
        this.ClawRight22.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 2);
        this.setRotation(this.ClawRight22, 0.6981317007977318F, 0.3490658503988659F, 0.0F);
        this.ClawLeft1 = new ModelRenderer(this, 24, 6);
        this.ClawLeft1.setRotationPoint(-7.1666665F, -0.39999962F, 3.6F);
        this.ClawLeft1.addBox(0.0F, 0.0F, -4.0F, 1, 1, 4);
        this.setRotation(this.ClawLeft1, 0.0F, -0.3490658503988659F, 0.0F);
        this.ClawLeft2 = new ModelRenderer(this, 26, 2);
        this.ClawLeft2.setRotationPoint(-7.0F, -0.39999962F, 3.0F);
        this.ClawLeft2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 2);
        this.setRotation(this.ClawLeft2, 0.6981317007977318F, -0.3490658503988659F, 0.0F);
        this.ClawRight11 = new ModelRenderer(this, 24, 6);
        this.ClawRight11.setRotationPoint(-7.8F, -0.39999962F, 3.6F);
        this.ClawRight11.addBox(-1.0F, 0.0F, -4.0F, 1, 1, 4);
        this.setRotation(this.ClawRight11, 0.0F, 0.3490658503988659F, 0.0F);
        this.ClawRight21 = new ModelRenderer(this, 26, 2);
        this.ClawRight21.setRotationPoint(-8.0F, -0.39999962F, 3.0F);
        this.ClawRight21.addBox(-1.0F, 0.0F, 0.0F, 1, 1, 2);
        this.setRotation(this.ClawRight21, 0.6981317007977318F, 0.3490658503988659F, 0.0F);
        this.Head = new ModelRenderer(this, 3, 29);
        this.Head.setRotationPoint(-4.0F, -31.4F, -7.3F);
        this.Head.addBox(-3.0F, -3.0F, -8.0F, 6, 6, 8);
        this.setRotation(this.Head, 0.08726646259971647F, 0.0F, 0.0F);
        this.Beak = new ModelRenderer(this, 0, 11);
        this.Beak.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Beak.addBox(-2.0F, 0.0F, -12.0F, 4, 3, 4);
        this.Head.addChild(this.Beak);
        this.HeadFeathers = new ModelRenderer(this, 24, 7);
        this.HeadFeathers.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadFeathers.addBox(-3.0F, -3.0F, -4.4F, 0, 6, 11);
        this.Head.addChild(this.HeadFeathers);
        this.HeadFeathers2 = new ModelRenderer(this, 24, 7);
        this.HeadFeathers2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadFeathers2.addBox(3.0F, -3.0F, -4.4F, 0, 6, 11);
        this.Head.addChild(this.HeadFeathers2);
        this.HeadFeathers3 = new ModelRenderer(this, 0, 18);
        this.HeadFeathers3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadFeathers3.addBox(-3.0F, -4.1F, -3.5F, 6, 0, 11);
        this.setRotation(this.HeadFeathers3, 0.2617993877991494F, 0.0F, 0.0F);
        this.Head.addChild(this.HeadFeathers3);
        this.Wing = new ModelRenderer(this, 34, 0);
        this.Wing.setRotationPoint(2.0F, -20.3F, -3.4F);
        this.Wing.addBox(0.0F, 0.0F, 0.0F, 1, 7, 11);
        this.setRotation(this.Wing, -0.08726646259971647F, 0.0F, 0.0F);
        this.Wing2 = new ModelRenderer(this, 34, 0);
        this.Wing2.setRotationPoint(-11.0F, -20.3F, -3.4F);
        this.Wing2.addBox(0.0F, 0.0F, 0.0F, 1, 7, 11);
        this.setRotation(this.Wing2, -0.08726646259971647F, 0.0F, 0.0F);
        this.TailBase = new ModelRenderer(this, 24, 64);
        this.TailBase.setRotationPoint(-3.0F, -18.5F, 4.3F);
        this.TailBase.addBox(-5.0F, 0.0F, 0.0F, 8, 6, 6);
        this.setRotation(this.TailBase, 0.7216936190680444F, 0.0F, 0.0F);
        this.TailBase2 = new ModelRenderer(this, 52, 64);
        this.TailBase2.setRotationPoint(-3.0F, -21.9F, 6.0F);
        this.TailBase2.addBox(-5.0F, 0.0F, 0.0F, 8, 6, 5);
        this.setRotation(this.TailBase2, 0.3490658503988659F, 0.0F, 0.0F);
        this.TailFeather3 = new ModelRenderer(this, 0, 76);
        this.TailFeather3.setRotationPoint(-7.0F, -19.8F, 8.2F);
        this.TailFeather3.addBox(-5.0F, 0.0F, 0.0F, 16, 0, 13);
        this.setRotation(this.TailFeather3, 0.8482299898376332F, 0.0F, 0.0F);
        this.UpperRightLeg = new ModelRenderer(this, 0, 3);
        this.UpperRightLeg.setRotationPoint(-0.5F, -13.599999F, 1.0F);
        this.UpperRightLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 7);
        this.setRotation(this.UpperRightLeg, -0.41887902047863906F, 0.0F, 0.0F);
        this.LowRightLeg = new ModelRenderer(this, 18, 0);
        this.LowRightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowRightLeg.addBox(-1.0F, 1.6F, 5.8F, 2, 10, 1);
        this.setRotation(this.LowRightLeg, 0.22689280275926282F, 0.0F, 0.0F);
        this.UpperRightLeg.addChild(this.LowRightLeg);
        this.ClawBackRight1 = new ModelRenderer(this, 26, 2);
        this.ClawBackRight1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ClawBackRight1.addBox(-0.5F, 6.5F, 11.2F, 1, 1, 2);
        this.setRotation(this.ClawBackRight1, -0.2792526803190927F, 0.0F, 0.0F);
        this.UpperRightLeg.addChild(this.ClawBackRight1);
        this.ClawBackRight2 = new ModelRenderer(this, 24, 13);
        this.ClawBackRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ClawBackRight2.addBox(-0.5F, 13.2F, 5.0F, 1, 1, 4);
        this.setRotation(this.ClawBackRight2, 0.41887902047863906F, 0.0F, 0.0F);
        this.UpperRightLeg.addChild(this.ClawBackRight2);
        this.UpperLeftLeg = new ModelRenderer(this, 0, 3);
        this.UpperLeftLeg.setRotationPoint(-7.5F, -13.599999F, 1.0F);
        this.UpperLeftLeg.addBox(-1.0F, 0.0F, 0.0F, 2, 1, 7);
        this.setRotation(this.UpperLeftLeg, -0.41887902047863906F, 0.0F, 0.0F);
        this.LowLeftLeg = new ModelRenderer(this, 18, 0);
        this.LowLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowLeftLeg.addBox(-1.0F, 1.6F, 5.8F, 2, 10, 1);
        this.setRotation(this.LowLeftLeg, 0.22689280275926282F, 0.0F, 0.0F);
        this.UpperLeftLeg.addChild(this.LowLeftLeg);
        this.ClawBackLeft1 = new ModelRenderer(this, 26, 2);
        this.ClawBackLeft1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ClawBackLeft1.addBox(-0.5F, 6.5F, 11.2F, 1, 1, 2);
        this.setRotation(this.ClawBackLeft1, -0.2792526803190927F, 0.0F, 0.0F);
        this.UpperLeftLeg.addChild(this.ClawBackLeft1);
        this.ClawBackLeft2 = new ModelRenderer(this, 24, 13);
        this.ClawBackLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ClawBackLeft2.addBox(-0.5F, 13.2F, 5.0F, 1, 1, 4);
        this.ClawBackLeft2.mirror = true;
        this.setRotation(this.ClawBackLeft2, 0.41887902047863906F, 0.0F, 0.0F);
        this.UpperLeftLeg.addChild(this.ClawBackLeft2);
        this.ClawFrontRightLeft1 = new ModelRenderer(this, 26, 2);
        this.ClawFrontRightLeft1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ClawFrontRightLeft1.addBox(8.0F, 9.7F, -8.9F, 1, 1, 2);
        this.setRotation(this.ClawFrontRightLeft1, 1.117010721276371F, -0.3490658503988659F, -0.13962634015954636F);
        this.UpperLeftLeg.addChild(this.ClawFrontRightLeft1);
        this.ClawFrontRightLeft2 = new ModelRenderer(this, 24, 6);
        this.ClawFrontRightLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ClawFrontRightLeft2.addBox(8.0F, 13.1F, -3.9F, 1, 1, 4);
        this.setRotation(this.ClawFrontRightLeft2, 0.41887902047863906F, -0.3490658503988659F, -0.13962634015954636F);
        this.UpperLeftLeg.addChild(this.ClawFrontRightLeft2);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale) {
    	
    	super.render(entity, limbSwing, limbSwingAmount, ageInTicks, rotationYaw, rotationPitch, scale);
    	setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, rotationYaw, rotationPitch, scale, entity);
    	
    	GlStateManager.pushMatrix();
        GlStateManager.translate(this.Shape1.offsetX, this.Shape1.offsetY, this.Shape1.offsetZ);
        GlStateManager.translate(this.Shape1.rotationPointX * scale, this.Shape1.rotationPointY * scale, this.Shape1.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.Shape1.offsetX, -this.Shape1.offsetY, -this.Shape1.offsetZ);
        GlStateManager.translate(-this.Shape1.rotationPointX * scale, -this.Shape1.rotationPointY * scale, -this.Shape1.rotationPointZ * scale);
        this.Shape1.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Shape2.offsetX, this.Shape2.offsetY, this.Shape2.offsetZ);
        GlStateManager.translate(this.Shape2.rotationPointX * scale, this.Shape2.rotationPointY * scale, this.Shape2.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.Shape2.offsetX, -this.Shape2.offsetY, -this.Shape2.offsetZ);
        GlStateManager.translate(-this.Shape2.rotationPointX * scale, -this.Shape2.rotationPointY * scale, -this.Shape2.rotationPointZ * scale);
        this.Shape2.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Shape3.offsetX, this.Shape3.offsetY, this.Shape3.offsetZ);
        GlStateManager.translate(this.Shape3.rotationPointX * scale, this.Shape3.rotationPointY * scale, this.Shape3.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.Shape3.offsetX, -this.Shape3.offsetY, -this.Shape3.offsetZ);
        GlStateManager.translate(-this.Shape3.rotationPointX * scale, -this.Shape3.rotationPointY * scale, -this.Shape3.rotationPointZ * scale);
        this.Shape3.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Shape4.offsetX, this.Shape4.offsetY, this.Shape4.offsetZ);
        GlStateManager.translate(this.Shape4.rotationPointX * scale, this.Shape4.rotationPointY * scale, this.Shape4.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.Shape4.offsetX, -this.Shape4.offsetY, -this.Shape4.offsetZ);
        GlStateManager.translate(-this.Shape4.rotationPointX * scale, -this.Shape4.rotationPointY * scale, -this.Shape4.rotationPointZ * scale);
        this.Shape4.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.ClawRight12.offsetX, this.ClawRight12.offsetY, this.ClawRight12.offsetZ);
        GlStateManager.translate(this.ClawRight12.rotationPointX * scale, this.ClawRight12.rotationPointY * scale, this.ClawRight12.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.ClawRight12.offsetX, -this.ClawRight12.offsetY, -this.ClawRight12.offsetZ);
        GlStateManager.translate(-this.ClawRight12.rotationPointX * scale, -this.ClawRight12.rotationPointY * scale, -this.ClawRight12.rotationPointZ * scale);
        this.ClawRight12.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.ClawRight22.offsetX, this.ClawRight22.offsetY, this.ClawRight22.offsetZ);
        GlStateManager.translate(this.ClawRight22.rotationPointX * scale, this.ClawRight22.rotationPointY * scale, this.ClawRight22.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.ClawRight22.offsetX, -this.ClawRight22.offsetY, -this.ClawRight22.offsetZ);
        GlStateManager.translate(-this.ClawRight22.rotationPointX * scale, -this.ClawRight22.rotationPointY * scale, -this.ClawRight22.rotationPointZ * scale);
        this.ClawRight21.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.ClawLeft1.offsetX, this.ClawLeft1.offsetY, this.ClawLeft1.offsetZ);
        GlStateManager.translate(this.ClawLeft1.rotationPointX * scale, this.ClawLeft1.rotationPointY * scale, this.ClawLeft1.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.ClawLeft1.offsetX, -this.ClawLeft1.offsetY, -this.ClawLeft1.offsetZ);
        GlStateManager.translate(-this.ClawLeft1.rotationPointX * scale, -this.ClawLeft1.rotationPointY * scale, -this.ClawLeft1.rotationPointZ * scale);
        this.ClawLeft1.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.ClawLeft2.offsetX, this.ClawLeft2.offsetY, this.ClawLeft2.offsetZ);
        GlStateManager.translate(this.ClawLeft2.rotationPointX * scale, this.ClawLeft2.rotationPointY * scale, this.ClawLeft2.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.ClawLeft2.offsetX, -this.ClawLeft2.offsetY, -this.ClawLeft2.offsetZ);
        GlStateManager.translate(-this.ClawLeft2.rotationPointX * scale, -this.ClawLeft2.rotationPointY * scale, -this.ClawLeft2.rotationPointZ * scale);
        this.ClawLeft2.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.ClawRight11.offsetX, this.ClawRight11.offsetY, this.ClawRight11.offsetZ);
        GlStateManager.translate(this.ClawRight11.rotationPointX * scale, this.ClawRight11.rotationPointY * scale, this.ClawRight11.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.ClawRight11.offsetX, -this.ClawRight11.offsetY, -this.ClawRight11.offsetZ);
        GlStateManager.translate(-this.ClawRight11.rotationPointX * scale, -this.ClawRight11.rotationPointY * scale, -this.ClawRight11.rotationPointZ * scale);
        this.ClawRight11.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.ClawRight21.offsetX, this.ClawRight21.offsetY, this.ClawRight21.offsetZ);
        GlStateManager.translate(this.ClawRight21.rotationPointX * scale, this.ClawRight21.rotationPointY * scale, this.ClawRight21.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.ClawRight21.offsetX, -this.ClawRight21.offsetY, -this.ClawRight21.offsetZ);
        GlStateManager.translate(-this.ClawRight21.rotationPointX * scale, -this.ClawRight21.rotationPointY * scale, -this.ClawRight21.rotationPointZ * scale);
        this.ClawRight21.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
        GlStateManager.translate(this.Head.rotationPointX * scale, this.Head.rotationPointY * scale, this.Head.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
        GlStateManager.translate(-this.Head.rotationPointX * scale, -this.Head.rotationPointY * scale, -this.Head.rotationPointZ * scale);
        this.Head.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Wing.offsetX, this.Wing.offsetY, this.Wing.offsetZ);
        GlStateManager.translate(this.Wing.rotationPointX * scale, this.Wing.rotationPointY * scale, this.Wing.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.Wing.offsetX, -this.Wing.offsetY, -this.Wing.offsetZ);
        GlStateManager.translate(-this.Wing.rotationPointX * scale, -this.Wing.rotationPointY * scale, -this.Wing.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.Wing.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.Wing2.offsetX, this.Wing2.offsetY, this.Wing2.offsetZ);
        GlStateManager.translate(this.Wing2.rotationPointX * scale, this.Wing2.rotationPointY * scale, this.Wing2.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.Wing2.offsetX, -this.Wing2.offsetY, -this.Wing2.offsetZ);
        GlStateManager.translate(-this.Wing2.rotationPointX * scale, -this.Wing2.rotationPointY * scale, -this.Wing2.rotationPointZ * scale);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.Wing2.render(scale);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.TailBase.offsetX, this.TailBase.offsetY, this.TailBase.offsetZ);
        GlStateManager.translate(this.TailBase.rotationPointX * scale, this.TailBase.rotationPointY * scale, this.TailBase.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.TailBase.offsetX, -this.TailBase.offsetY, -this.TailBase.offsetZ);
        GlStateManager.translate(-this.TailBase.rotationPointX * scale, -this.TailBase.rotationPointY * scale, -this.TailBase.rotationPointZ * scale);
        this.TailBase.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.TailBase2.offsetX, this.TailBase2.offsetY, this.TailBase2.offsetZ);
        GlStateManager.translate(this.TailBase2.rotationPointX * scale, this.TailBase2.rotationPointY * scale, this.TailBase2.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.TailBase2.offsetX, -this.TailBase2.offsetY, -this.TailBase2.offsetZ);
        GlStateManager.translate(-this.TailBase2.rotationPointX * scale, -this.TailBase2.rotationPointY * scale, -this.TailBase2.rotationPointZ * scale);
        this.TailBase2.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.TailFeather3.offsetX, this.TailFeather3.offsetY, this.TailFeather3.offsetZ);
        GlStateManager.translate(this.TailFeather3.rotationPointX * scale, this.TailFeather3.rotationPointY * scale, this.TailFeather3.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.TailFeather3.offsetX, -this.TailFeather3.offsetY, -this.TailFeather3.offsetZ);
        GlStateManager.translate(-this.TailFeather3.rotationPointX * scale, -this.TailFeather3.rotationPointY * scale, -this.TailFeather3.rotationPointZ * scale);
        this.TailFeather3.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.UpperRightLeg.offsetX, this.UpperRightLeg.offsetY, this.UpperRightLeg.offsetZ);
        GlStateManager.translate(this.UpperRightLeg.rotationPointX * scale, this.UpperRightLeg.rotationPointY * scale, this.UpperRightLeg.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.UpperRightLeg.offsetX, -this.UpperRightLeg.offsetY, -this.UpperRightLeg.offsetZ);
        GlStateManager.translate(-this.UpperRightLeg.rotationPointX * scale, -this.UpperRightLeg.rotationPointY * scale, -this.UpperRightLeg.rotationPointZ * scale);
        this.UpperRightLeg.render(scale);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.UpperLeftLeg.offsetX, this.UpperLeftLeg.offsetY, this.UpperLeftLeg.offsetZ);
        GlStateManager.translate(this.UpperLeftLeg.rotationPointX * scale, this.UpperLeftLeg.rotationPointY * scale, this.UpperLeftLeg.rotationPointZ * scale);
        GlStateManager.scale(1.0F, 1.0F, 1.0F);
        GlStateManager.translate(-this.UpperLeftLeg.offsetX, -this.UpperLeftLeg.offsetY, -this.UpperLeftLeg.offsetZ);
        GlStateManager.translate(-this.UpperLeftLeg.rotationPointX * scale, -this.UpperLeftLeg.rotationPointY * scale, -this.UpperLeftLeg.rotationPointZ * scale);
        this.UpperLeftLeg.render(scale);
        GlStateManager.popMatrix();
    }

    protected void convertToChild(ModelRenderer parent, ModelRenderer child) {
    	child.rotationPointX -= parent.rotationPointX;
    	child.rotationPointY -= parent.rotationPointY;
    	child.rotationPointZ -= parent.rotationPointZ;
    	
    	child.rotateAngleX -= parent.rotateAngleX;
    	child.rotateAngleY -= parent.rotateAngleY;
    	child.rotateAngleZ -= parent.rotateAngleZ;
    	
    	parent.addChild(child);
    }

    public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale, Entity entity) {
    	float XAngle = rotationPitch / 57.29578F;
    	float YAngle = rotationYaw / 57.29578F;
    	
    	this.Head.rotateAngleX = (XAngle);
        this.Head.rotateAngleY = (YAngle);
    	
    	this.UpperLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.UpperRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
}
