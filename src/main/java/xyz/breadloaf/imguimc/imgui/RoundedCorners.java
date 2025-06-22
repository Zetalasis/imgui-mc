package xyz.breadloaf.imguimc.imgui;

import imgui.ImGui;
import imgui.flag.ImGuiCol;
import imgui.flag.ImGuiStyleVar;
import xyz.breadloaf.imguimc.interfaces.Theme;

public class RoundedCorners implements Theme {
    @Override
    public void preRender() {
        ImGui.pushStyleColor(ImGuiCol.WindowBg, 0.1f, 0.1f, 0.1f, 1.0f);
        ImGui.pushStyleVar(ImGuiStyleVar.WindowRounding, 5.0f);
    }

    @Override
    public void postRender() {
        ImGui.popStyleVar();
        ImGui.popStyleColor();
    }
}