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
 * Cupcake by Frousties
 */
@SideOnly(Side.CLIENT)
public class ModelCupcake extends ModelBase {
	public ModelRenderer Base;
    public ModelRenderer Circling;
    public ModelRenderer LegRight;
    public ModelRenderer LegLeft;
    public ModelRenderer Cake1;
    public ModelRenderer Cake2;
    public ModelRenderer Cake3;
    public ModelRenderer EyeLeft;
    public ModelRenderer EyeRight;
    public ModelRenderer Smile1;
    public ModelRenderer Smile2;
    public ModelRenderer Smile3;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;

    public ModelCupcake() {
        this.textureWidth = 56;
        this.textureHeight = 77;

        this.Base = new ModelRenderer(this, 0, 15);
        this.Base.setRotationPoint(-6.0F, 16.0F, -6.0F);
        this.Base.addBox(0.0F, 0.0F, 0.0F, 12, 3, 12);
        this.Circling = new ModelRenderer(this, 0, 47);
        this.Circling.setRotationPoint(-7.0F, 11.0F, -7.0F);
        this.Circling.addBox(0.0F, 0.0F, 0.0F, 14, 5, 14);
        this.LegRight = new ModelRenderer(this, 4, 1);
        this.LegRight.setRotationPoint(-4.5F, 19.0F, -0.53333336F);
        this.LegRight.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.LegLeft = new ModelRenderer(this, 4, 1);
        this.LegLeft.setRotationPoint(3.5F, 19.0F, -0.53333336F);
        this.LegLeft.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1);
        this.Cake1 = new ModelRenderer(this, 0, 30);
        this.Cake1.setRotationPoint(0.0F, 11.0F, 0.0F);
        this.Cake1.addBox(-6.4F, -4.0F, -6.5F, 13, 4, 13);
        this.Cake2 = new ModelRenderer(this, 0, 0);
        this.Cake2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cake2.addBox(-5.5F, -8.0F, -5.5F, 11, 4, 11);
        this.Cake1.addChild(this.Cake2);
        this.Cake3 = new ModelRenderer(this, 0, 66);
        this.Cake3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Cake3.addBox(-5.0F, -9.0F, -5.0F, 10, 1, 10);
        this.Cake1.addChild(this.Cake3);
        this.EyeLeft = new ModelRenderer(this, 33, 2);
        this.EyeLeft.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.EyeLeft.addBox(-3.0F, -6.5F, -6.0F, 1, 1, 1);
        this.Cake1.addChild(this.EyeLeft);
        this.EyeRight = new ModelRenderer(this, 33, 2);
        this.EyeRight.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.EyeRight.addBox(2.0F, -6.5F, -6.0F, 1, 1, 1);
        this.Cake1.addChild(this.EyeRight);
        this.Smile1 = new ModelRenderer(this, 33, 0);
        this.Smile1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Smile1.addBox(-2.0F, -1.5F, -7.0F, 4, 1, 1);
        this.Cake1.addChild(this.Smile1);
        this.Smile2 = new ModelRenderer(this, 36, 0);
        this.Smile2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Smile2.addBox(-2.5F, -2.0F, -7.0F, 1, 1, 1);
        this.Cake1.addChild(this.Smile2);
        this.Smile3 = new ModelRenderer(this, 36, 0);
        this.Smile3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Smile3.addBox(1.5F, -2.0F, -7.0F, 1, 1, 1);
        this.Cake1.addChild(this.Smile3);
        this.LeftArm = new ModelRenderer(this, 0, 0);
        this.LeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LeftArm.addBox(-7.0F, 1.5F, 0.0F, 1, 6, 1);
        this.setRotation(this.LeftArm, 0.0F, 0.0F, 0.6981317007977318F);
        this.Cake1.addChild(this.LeftArm);
        this.RightArm = new ModelRenderer(this, 0, 0);
        this.RightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RightArm.addBox(6.0F, 1.5F, 0.0F, 1, 6, 1);
        this.setRotation(this.RightArm, 0.0F, 0.0F, -0.6981317007977318F);
        this.Cake1.addChild(this.RightArm);
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float rotationYaw, float rotationPitch, float scale) {
        
    	super.render(entity, limbSwing, limbSwingAmount, ageInTicks, rotationYaw, rotationPitch, scale);
    	setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, rotationYaw, rotationPitch, scale, entity);
    	
    	this.Base.render(scale);
        this.Circling.render(scale);
        this.LegRight.render(scale);
        this.LegLeft.render(scale);
        this.Cake1.render(scale);
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
    	
    	this.Cake1.rotateAngleX = (XAngle);
        this.Cake1.rotateAngleY = (YAngle);
    	
    	this.LegLeft.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.LegRight.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }
}
