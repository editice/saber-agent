package org.editice.saber.agent.core.command.cmds;

import org.editice.saber.agent.core.command.CMD;
import org.editice.saber.agent.core.command.Command;

/**
 * @author tinglang
 * @date 2018/10/23.
 */
@CMD(name = "help", summary = "display saber help", eg={"help"}, priority = 0)
public class HelpCommand implements Command {
}
