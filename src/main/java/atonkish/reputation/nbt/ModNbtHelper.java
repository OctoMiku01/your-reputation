package atonkish.reputation.nbt;

import java.util.UUID;

import net.minecraft.nbt.Tag;
import net.minecraft.nbt.IntArrayTag;
import net.minecraft.core.UUIDUtil;

public final class ModNbtHelper {
    public static IntArrayTag fromUuid(UUID uuid) {
        return new IntArrayTag(UUIDUtil.uuidToIntArray(uuid));
    }

    public static UUID toUuid(Tag element) {
        if (element.getType() != IntArrayTag.TYPE) {
            throw new IllegalArgumentException(
                    "Expected UUID-Tag to be of type " + IntArrayTag.TYPE.getPrettyName() + ", but found "
                            + element.getType().getPrettyName() + ".");
        } else {
            int[] is = ((IntArrayTag) element).getAsIntArray();
            if (is.length != 4) {
                throw new IllegalArgumentException(
                        "Expected UUID-Array to be of length 4, but found " + is.length + ".");
            } else {
                return UUIDUtil.uuidFromIntArray(is);
            }
        }
    }
}
