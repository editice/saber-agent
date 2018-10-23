package org.editice.saber.agent.core.command;

import org.editice.saber.agent.core.util.GaClassUtils;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tinglang
 * @date 2018/10/23.
 */
public class CommandManager {

    private static final String CMMAND_PACKAGE = "org.editice.saber.agent.core.command.cmds";

    private final Map<String, Class<?>> commands = new HashMap<String, Class<?>>();

    private static final CommandManager instance = new CommandManager();

    public static synchronized CommandManager getInstance() {
        return instance;
    }

    private CommandManager() {
        for (final Class<?> clazz : GaClassUtils.scanPackage(CommandManager.class.getClassLoader(), CMMAND_PACKAGE)) {
            if (Modifier.isAbstract(clazz.getModifiers())
                    || !Command.class.isAssignableFrom(clazz)) {
                continue;
            }

            if(!clazz.isAnnotationPresent(CMD.class)){
                continue;
            }

            final CMD cmd = clazz.getAnnotation(CMD.class);
            commands.put(cmd.name(), clazz);
        }
    }

    public Map<String, Class<?>> listCommands() {
        return new HashMap<String, Class<?>>(commands);
    }



}
