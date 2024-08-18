package dev.mayaqq.calcium.mixin;

<<<<<<< Updated upstream
import com.mojang.blaze3d.vertex.PoseStack;
=======
>>>>>>> Stashed changes
import net.minecraft.client.renderer.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
<<<<<<< Updated upstream
    @Inject(method = "renderLevel", at = @At("HEAD"), cancellable = true)
    private void render(float f, long l, PoseStack poseStack, CallbackInfo ci) {
=======
    @Inject(method = "tick", at = @At("HEAD"), cancellable = true)
    private void render(CallbackInfo ci) {
>>>>>>> Stashed changes
        ci.cancel();
    }
}
