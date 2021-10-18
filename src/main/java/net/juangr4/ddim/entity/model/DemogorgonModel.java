package net.juangr4.ddim.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.juangr4.ddim.entity.custom.DemogorgonEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class DemogorgonModel<T extends DemogorgonEntity> extends EntityModel<DemogorgonEntity> {

    private final ModelRenderer body;
	private final ModelRenderer topbody;
	private final ModelRenderer leftarm1;
	private final ModelRenderer leftarm2;
	private final ModelRenderer leftarm3;
	private final ModelRenderer head;
	private final ModelRenderer head1;
	private final ModelRenderer lefttophead1;
	private final ModelRenderer lefttophead2;
	private final ModelRenderer tophead1;
	private final ModelRenderer tophead2;
	private final ModelRenderer righttophead1;
	private final ModelRenderer righttophead2;
	private final ModelRenderer rightdownhead1;
	private final ModelRenderer rightdownhead2;
	private final ModelRenderer leftdownhead1;
	private final ModelRenderer leftdownhead2;
	private final ModelRenderer rightarm1;
	private final ModelRenderer rightarm2;
	private final ModelRenderer rightarm3;
	private final ModelRenderer rightleg1;
	private final ModelRenderer rightleg2;
	private final ModelRenderer rightleg3;
	private final ModelRenderer leftleg1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftleg3;

    public DemogorgonModel() {
        this.texWidth = 128;
        this.texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 6.0F, 0.0F);
		setRotationAngle(body, 0.2618F, 0.0F, 0.0F);
		body.texOffs(0, 50).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 3.0F, 4.0F, 0.0F, false);
		body.texOffs(20, 50).addBox(-2.5F, -7.0F, -1.5F, 5.0F, 4.0F, 3.0F, 0.0F, false);
		body.texOffs(0, 57).addBox(-3.0F, -3.0F, -2.0F, 6.0F, 3.0F, 4.0F, 0.25F, false);

		topbody = new ModelRenderer(this);
		topbody.setPos(0.0F, -7.0F, 0.0F);
		body.addChild(topbody);
		topbody.texOffs(28, 33).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.25F, false);
		topbody.texOffs(28, 16).addBox(-4.0F, -6.0F, -2.0F, 8.0F, 6.0F, 4.0F, 0.0F, false);

		leftarm1 = new ModelRenderer(this);
		leftarm1.setPos(5.0F, -4.0F, 0.0F);
		topbody.addChild(leftarm1);
		setRotationAngle(leftarm1, -0.2618F, 0.0F, -0.1396F);
		leftarm1.texOffs(0, 16).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, true);

		leftarm2 = new ModelRenderer(this);
		leftarm2.setPos(0.0F, 7.0F, 2.0F);
		leftarm1.addChild(leftarm2);
		setRotationAngle(leftarm2, 1.1345F, 0.0F, 0.0F);
		leftarm2.texOffs(52, 16).addBox(-1.0F, -4.0F, -9.0F, 3.0F, 4.0F, 9.0F, 0.01F, true);

		leftarm3 = new ModelRenderer(this);
		leftarm3.setPos(0.0F, -4.0F, -9.0F);
		leftarm2.addChild(leftarm3);
		setRotationAngle(leftarm3, -1.1345F, 0.0F, 0.0F);
		leftarm3.texOffs(0, 33).addBox(-1.0F, 0.0F, 0.0F, 3.0F, 3.0F, 4.0F, 0.02F, true);
		leftarm3.texOffs(0, 0).addBox(-1.0F, 2.4F, 0.5F, 1.0F, 2.0F, 1.0F, -0.05F, true);
		leftarm3.texOffs(0, 0).addBox(-1.0F, 3.4F, 0.5F, 1.0F, 2.0F, 1.0F, -0.15F, true);
		leftarm3.texOffs(0, 0).addBox(0.5F, 2.9F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, true);
		leftarm3.texOffs(0, 0).addBox(0.5F, 3.9F, 0.0F, 1.0F, 2.0F, 1.0F, -0.2F, true);
		leftarm3.texOffs(0, 0).addBox(1.0F, 2.9F, 1.0F, 1.0F, 2.0F, 1.0F, -0.1F, true);
		leftarm3.texOffs(0, 0).addBox(1.0F, 3.9F, 1.0F, 1.0F, 2.0F, 1.0F, -0.2F, true);
		leftarm3.texOffs(0, 0).addBox(1.0F, 2.9F, 2.0F, 1.0F, 2.0F, 1.0F, -0.1F, true);
		leftarm3.texOffs(0, 0).addBox(1.0F, 3.9F, 2.0F, 1.0F, 2.0F, 1.0F, -0.2F, true);
		leftarm3.texOffs(0, 0).addBox(1.0F, 2.9F, 3.0F, 1.0F, 2.0F, 1.0F, -0.1F, true);
		leftarm3.texOffs(0, 0).addBox(1.0F, 3.9F, 3.0F, 1.0F, 2.0F, 1.0F, -0.2F, true);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -6.0F, 0.0F);
		topbody.addChild(head);
		head.texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(71, 7).addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		head.texOffs(52, 29).addBox(-2.5F, -6.5F, -5.5F, 5.0F, 4.0F, 1.0F, 0.0F, false);
		head.texOffs(72, 38).addBox(-1.5F, -7.5F, -5.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(72, 38).addBox(-1.5F, -2.5F, -5.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		head.texOffs(96, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);

		head1 = new ModelRenderer(this);
		head1.setPos(0.0F, 31.0F, 0.0F);
		head.addChild(head1);
		head1.texOffs(7, 7).addBox(-4.0F, -39.0F, -5.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		head1.texOffs(7, 7).addBox(-4.0F, -39.0F, -6.0F, 8.0F, 8.0F, 1.0F, 0.0F, false);
		head1.texOffs(67, 16).addBox(-3.0F, -38.0F, -7.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		head1.texOffs(67, 16).addBox(-3.0F, -38.0F, -8.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		head1.texOffs(67, 16).addBox(-3.0F, -38.0F, -9.0F, 6.0F, 6.0F, 1.0F, 0.0F, false);
		head1.texOffs(81, 16).addBox(-2.0F, -37.0F, -10.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head1.texOffs(81, 16).addBox(-2.0F, -37.0F, -11.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head1.texOffs(81, 16).addBox(-2.0F, -37.0F, -11.5F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		head1.texOffs(91, 16).addBox(-1.0F, -36.0F, -12.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		head1.texOffs(0, 0).addBox(-4.0F, -39.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head1.texOffs(32, 0).addBox(-4.0F, -39.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);

		lefttophead1 = new ModelRenderer(this);
		lefttophead1.setPos(2.5F, -5.5F, -5.0F);
		head.addChild(lefttophead1);
		setRotationAngle(lefttophead1, 0.8727F, 0.0F, 0.9599F);
		lefttophead1.texOffs(80, 48).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		lefttophead1.texOffs(108, 48).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		lefttophead2 = new ModelRenderer(this);
		lefttophead2.setPos(-2.5F, -6.0F, 0.0F);
		lefttophead1.addChild(lefttophead2);
		setRotationAngle(lefttophead2, 0.6981F, 0.0F, 0.0F);
		lefttophead2.texOffs(108, 44).addBox(1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		tophead1 = new ModelRenderer(this);
		tophead1.setPos(0.0F, -7.0F, -5.0F);
		head.addChild(tophead1);
		setRotationAngle(tophead1, 0.7854F, 0.0F, 0.0F);
		tophead1.texOffs(52, 36).addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
		tophead1.texOffs(72, 38).addBox(-1.5F, -5.0F, -1.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		tophead1.texOffs(108, 40).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		tophead2 = new ModelRenderer(this);
		tophead2.setPos(0.0F, -5.0F, 0.0F);
		tophead1.addChild(tophead2);
		setRotationAngle(tophead2, 0.6981F, 0.0F, 0.0F);
		tophead2.texOffs(108, 38).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
		tophead2.texOffs(52, 48).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		righttophead1 = new ModelRenderer(this);
		righttophead1.setPos(-2.5F, -5.5F, -5.0F);
		head.addChild(righttophead1);
		setRotationAngle(righttophead1, 0.8727F, 0.0F, -0.9599F);
		righttophead1.texOffs(80, 40).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		righttophead1.texOffs(108, 44).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		righttophead2 = new ModelRenderer(this);
		righttophead2.setPos(2.5F, -6.0F, 0.0F);
		righttophead1.addChild(righttophead2);
		setRotationAngle(righttophead2, 0.6981F, 0.0F, 0.0F);
		righttophead2.texOffs(108, 44).addBox(-4.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		rightdownhead1 = new ModelRenderer(this);
		rightdownhead1.setPos(-2.0F, -2.5F, -5.0F);
		head.addChild(rightdownhead1);
		setRotationAngle(rightdownhead1, 0.8727F, 0.0F, -2.3562F);
		rightdownhead1.texOffs(90, 40).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		rightdownhead1.texOffs(100, 40).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		rightdownhead2 = new ModelRenderer(this);
		rightdownhead2.setPos(2.5F, -6.0F, 0.0F);
		rightdownhead1.addChild(rightdownhead2);
		setRotationAngle(rightdownhead2, 0.6981F, 0.0F, 0.0F);
		rightdownhead2.texOffs(100, 40).addBox(-4.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);

		leftdownhead1 = new ModelRenderer(this);
		leftdownhead1.setPos(2.0F, -2.5F, -5.0F);
		head.addChild(leftdownhead1);
		setRotationAngle(leftdownhead1, 0.8727F, 0.0F, 2.3562F);
		leftdownhead1.texOffs(90, 48).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		leftdownhead1.texOffs(100, 44).addBox(-1.5F, -2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 0.0F, true);

		leftdownhead2 = new ModelRenderer(this);
		leftdownhead2.setPos(-2.5F, -6.0F, 0.0F);
		leftdownhead1.addChild(leftdownhead2);
		setRotationAngle(leftdownhead2, 0.6981F, 0.0F, 0.0F);
		leftdownhead2.texOffs(100, 44).addBox(1.0F, -3.0F, -1.0F, 3.0F, 3.0F, 1.0F, 0.0F, true);

		rightarm1 = new ModelRenderer(this);
		rightarm1.setPos(-5.0F, -4.0F, 0.0F);
		topbody.addChild(rightarm1);
		setRotationAngle(rightarm1, -0.2618F, 0.0F, 0.1396F);
		rightarm1.texOffs(0, 16).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.0F, false);

		rightarm2 = new ModelRenderer(this);
		rightarm2.setPos(0.0F, 7.0F, 2.0F);
		rightarm1.addChild(rightarm2);
		setRotationAngle(rightarm2, 1.1345F, 0.0F, 0.0F);
		rightarm2.texOffs(52, 16).addBox(-2.0F, -4.0F, -9.0F, 3.0F, 4.0F, 9.0F, 0.01F, false);

		rightarm3 = new ModelRenderer(this);
		rightarm3.setPos(0.0F, -4.0F, -9.0F);
		rightarm2.addChild(rightarm3);
		setRotationAngle(rightarm3, -1.1345F, 0.0F, 0.0F);
		rightarm3.texOffs(0, 33).addBox(-2.0F, 0.0F, 0.0F, 3.0F, 3.0F, 4.0F, 0.02F, false);
		rightarm3.texOffs(0, 0).addBox(0.0F, 2.4F, 0.5F, 1.0F, 2.0F, 1.0F, -0.05F, false);
		rightarm3.texOffs(0, 0).addBox(0.0F, 3.4F, 0.5F, 1.0F, 2.0F, 1.0F, -0.15F, false);
		rightarm3.texOffs(0, 0).addBox(-1.5F, 2.9F, 0.0F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		rightarm3.texOffs(0, 0).addBox(-1.5F, 3.9F, 0.0F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		rightarm3.texOffs(0, 0).addBox(-2.0F, 2.9F, 1.0F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		rightarm3.texOffs(0, 0).addBox(-2.0F, 3.9F, 1.0F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		rightarm3.texOffs(0, 0).addBox(-2.0F, 2.9F, 2.0F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		rightarm3.texOffs(0, 0).addBox(-2.0F, 3.9F, 2.0F, 1.0F, 2.0F, 1.0F, -0.2F, false);
		rightarm3.texOffs(0, 0).addBox(-2.0F, 2.9F, 3.0F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		rightarm3.texOffs(0, 0).addBox(-2.0F, 3.9F, 3.0F, 1.0F, 2.0F, 1.0F, -0.2F, false);

		rightleg1 = new ModelRenderer(this);
		rightleg1.setPos(-2.0F, 6.0F, 0.0F);
		rightleg1.texOffs(14, 16).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.02F, false);

		rightleg2 = new ModelRenderer(this);
		rightleg2.setPos(0.0F, 9.0F, -1.0F);
		rightleg1.addChild(rightleg2);
		rightleg2.texOffs(14, 29).addBox(-2.0F, -1.0F, 0.0F, 3.0F, 9.0F, 4.0F, 0.01F, false);

		rightleg3 = new ModelRenderer(this);
		rightleg3.setPos(0.0F, 7.0F, 0.0F);
		rightleg2.addChild(rightleg3);
		rightleg3.texOffs(14, 42).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		rightleg3.texOffs(24, 0).addBox(-1.5F, 1.0F, -4.0F, 1.0F, 1.0F, 3.0F, 0.05F, false);
		rightleg3.texOffs(24, 0).addBox(-1.5F, 1.1F, -5.0F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		rightleg3.texOffs(24, 0).addBox(-3.0F, 1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.05F, false);
		rightleg3.texOffs(24, 0).addBox(-3.0F, 1.1F, -4.0F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		rightleg3.texOffs(24, 0).addBox(0.0F, 1.0F, -4.0F, 1.0F, 1.0F, 3.0F, 0.05F, false);
		rightleg3.texOffs(24, 0).addBox(0.0F, 1.1F, -5.0F, 1.0F, 1.0F, 3.0F, -0.1F, false);

		leftleg1 = new ModelRenderer(this);
		leftleg1.setPos(2.0F, 6.0F, 0.0F);
		leftleg1.texOffs(14, 16).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 9.0F, 4.0F, 0.02F, true);

		leftleg2 = new ModelRenderer(this);
		leftleg2.setPos(0.0F, 9.0F, -1.0F);
		leftleg1.addChild(leftleg2);
		leftleg2.texOffs(14, 29).addBox(-1.0F, -1.0F, 0.0F, 3.0F, 9.0F, 4.0F, 0.01F, true);

		leftleg3 = new ModelRenderer(this);
		leftleg3.setPos(0.0F, 7.0F, 0.0F);
		leftleg2.addChild(leftleg3);
		leftleg3.texOffs(14, 42).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, true);
		leftleg3.texOffs(24, 0).addBox(-1.0F, 1.0F, -4.0F, 1.0F, 1.0F, 3.0F, 0.05F, true);
		leftleg3.texOffs(24, 0).addBox(-1.0F, 1.1F, -5.0F, 1.0F, 1.0F, 3.0F, -0.1F, true);
		leftleg3.texOffs(24, 0).addBox(0.5F, 1.0F, -4.0F, 1.0F, 1.0F, 3.0F, 0.05F, true);
		leftleg3.texOffs(24, 0).addBox(0.5F, 1.1F, -5.0F, 1.0F, 1.0F, 3.0F, -0.1F, true);
		leftleg3.texOffs(24, 0).addBox(2.0F, 1.0F, -3.0F, 1.0F, 1.0F, 3.0F, 0.05F, true);
		leftleg3.texOffs(24, 0).addBox(2.0F, 1.1F, -4.0F, 1.0F, 1.0F, 3.0F, -0.1F, true);

    }

    @Override
	public void setupAnim(DemogorgonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rightleg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leftleg1.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
    
}
