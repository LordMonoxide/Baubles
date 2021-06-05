package lazy.baubles.api.cap.caps;

import lazy.baubles.api.bauble.BaubleType;
import lazy.baubles.api.bauble.IBauble;
import net.minecraft.nbt.INBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.capabilities.Capability;

import javax.annotation.Nullable;
import java.util.concurrent.Callable;

public class BaubleCap {

    public static class IBaubleStorage implements Capability.IStorage<IBauble> {

        @Nullable
        @Override
        public INBT writeNBT(Capability<IBauble> capability, IBauble instance, Direction side) {
            return null;
        }

        @Override
        public void readNBT(Capability<IBauble> capability, IBauble instance, Direction side, INBT nbt) {

        }
    }

    public static class IBaubleFactory implements Callable<IBauble> {

        @Override
        public IBauble call() {
            return (itemStack) -> BaubleType.TRINKET;
        }
    }
}
