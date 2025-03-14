package tgtm.mysticalmanipulation.functionalflora;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import vazkii.botania.api.block.WandBindable;
import vazkii.botania.api.block.WandHUD;
import vazkii.botania.api.block.Wandable;
import vazkii.botania.api.block_entity.FunctionalFlowerBlockEntity;
import vazkii.botania.api.block_entity.RadiusDescriptor;

public class Pressiflora extends FunctionalFlowerBlockEntity implements Wandable{

    private static final int RANGE = 5;
    private static final int YRANGE = 5;

    public Pressiflora(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    public int getMaxMana() {
        return 640;
    }

    @Override
    public int getColor() {
        return 0x4a4a4a;
    }

    @Override
    public @Nullable RadiusDescriptor getRadius() {
        return RadiusDescriptor.Rectangle.square(getEffectivePos(), getRange());
    }

    @Override
    public boolean onUsedByWand(@Nullable Player player, ItemStack itemStack, Direction direction) {
        System.out.print("WANDED");
        return false;
    }

    public int getRange() {
        return RANGE;
    }

    public int getRangeY() {
        return YRANGE;
    }



}
