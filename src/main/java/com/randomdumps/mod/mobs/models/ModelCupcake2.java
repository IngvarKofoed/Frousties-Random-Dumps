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
 * Penguin by XavierEmeralds
 */
@SideOnly(Side.CLIENT)
public class ModelCupcake2 extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Body1;
    public ModelRenderer Body2;
    public ModelRenderer Leg1;
    public ModelRenderer Foot1;
    public ModelRenderer Leg2;
    public ModelRenderer Foot2;
    public ModelRenderer Arm1;
    public ModelRenderer Arm11;
    public ModelRenderer Arm2;
    public ModelRenderer Arm22;
    public ModelRenderer Head;
    public ModelRenderer Beak;
    
    public ModelCupcake2() 
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Body = new ModelRenderer(this, 16, 0);
        this.Body.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Body.addBox(-3.0F, 0.0F, -2.0F, 6, 12, 4);
        this.Body1 = new ModelRenderer(this, 0, 12);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body1.addBox(-2.5F, -0.5F, -1.5F, 5, 1, 3);
        this.Body.addChild(this.Body1);
        this.Body2 = new ModelRenderer(this, 0, 12);
        this.Body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body2.addBox(-2.5F, 11.5F, -1.5F, 5, 1, 3);
        this.Body.addChild(this.Body2);
        this.Leg1 = new ModelRenderer(this, 0, 5);
        this.Leg1.setRotationPoint(1.0F, 21.5F, 0.0F);
        this.Leg1.addBox(-0.2F, -0.5F, -0.5F, 1, 2, 1);
        this.Foot1 = new ModelRenderer(this, 0, 0);
        this.Foot1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Foot1.addBox(-0.7F, 1.5F, -2.0F, 2, 1, 3);
        this.Leg1.addChild(this.Foot1);
        this.Leg2 = new ModelRenderer(this, 0, 5);
        this.Leg2.setRotationPoint(-1.0F, 21.5F, 0.0F);
        this.Leg2.addBox(-1.0F, -0.5F, -0.5F, 1, 2, 1);
        this.Foot2 = new ModelRenderer(this, 0, 0);
        this.Foot2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Foot2.addBox(-1.5F, 1.5F, -2.0F, 2, 1, 3);
        this.Leg2.addChild(this.Foot2);
        this.Arm1 = new ModelRenderer(this, 44, 6);
        this.Arm1.setRotationPoint(-3.0F, 10.5F, 0.0F);
        this.Arm1.addBox(-1.0F, 0.0F, -1.5F, 1, 7, 3);
        this.Arm11 = new ModelRenderer(this, 42, 16);
        this.Arm11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Arm11.addBox(-1.0F, 7.0F, -1.0F, 1, 1, 2);
        this.Arm1.addChild(this.Arm11);
        this.Arm2 = new ModelRenderer(this, 36, 6);
        this.Arm2.setRotationPoint(3.0F, 10.5F, 0.0F);
        this.Arm2.addBox(0.0F, 0.0F, -1.5F, 1, 7, 3);
        this.Arm22 = new ModelRenderer(this, 34, 16);
        this.Arm22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Arm22.addBox(0.0F, 7.0F, -1.0F, 1, 1, 2);
        this.Arm2.addChild(this.Arm22);
        this.Head = new ModelRenderer(this, 36, 0);
        this.Head.setRotationPoint(0.0F, 9.0F, 0.0F);
        this.Head.addBox(-1.5F, -3.5F, -1.5F, 3, 3, 3);
        this.Beak = new ModelRenderer(this, 0, 9);
        this.Beak.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Beak.addBox(-1.0F, -1.7F, -2.5F, 2, 1, 1);
        this.Head.addChild(this.Beak);
    }
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor) 
    {
        super.render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
        setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
        
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.Body.render(scaleFactor);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.Leg1.render(scaleFactor);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.Leg2.render(scaleFactor);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.Arm1.render(scaleFactor);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.Arm2.render(scaleFactor);
        GlStateManager.disableBlend();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        this.Head.render(scaleFactor);
        GlStateManager.disableBlend();
    }
    public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
    {
        float XAngle = headPitch / 57.29578F;
        float YAngle = netHeadYaw / 57.29578F;
        
        this.Head.rotateAngleX = (0.2617794F + XAngle);
        this.Head.rotateAngleY = (YAngle);
        
        this.Leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.Leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        
        this.Arm1.rotateAngleX = MathHelper.cos(limbSwing * 0.0662F) * 1.4F * limbSwingAmount;
        this.Arm2.rotateAngleX = MathHelper.cos(limbSwing * 0.0662F +(float)Math.PI) * 1.4F * limbSwingAmount;
    }
    
}