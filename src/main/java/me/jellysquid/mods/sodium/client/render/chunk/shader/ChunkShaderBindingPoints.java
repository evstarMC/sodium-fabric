package me.jellysquid.mods.sodium.client.render.chunk.shader;

import me.jellysquid.mods.sodium.client.gl.shader.ShaderBindingPoint;

public class ChunkShaderBindingPoints {
    public static final ShaderBindingPoint POSITION = new ShaderBindingPoint(0);
    public static final ShaderBindingPoint COLOR = new ShaderBindingPoint(1);
    public static final ShaderBindingPoint TEX_COORD = new ShaderBindingPoint(2);
    public static final ShaderBindingPoint LIGHT_COORD = new ShaderBindingPoint(3);

    public static final ShaderBindingPoint MODEL_OFFSET = new ShaderBindingPoint(4);

    public static final ShaderBindingPoint BLOCK_ID = new ShaderBindingPoint(5);
    public static final ShaderBindingPoint MID_TEX_COORD = new ShaderBindingPoint(6);
    public static final ShaderBindingPoint TANGENT = new ShaderBindingPoint(7);
    public static final ShaderBindingPoint NORMAL = new ShaderBindingPoint(8);
}
