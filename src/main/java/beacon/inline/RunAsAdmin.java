package beacon.inline;

import aggressor.AggressorClient;
import beacon.PostExInline;
import common.CommonUtils;

public class RunAsAdmin extends PostExInline {
    protected String command;

    public RunAsAdmin(AggressorClient aggressorClient, String string) {
        super(aggressorClient);
        this.command = string;
    }

    public byte[] getArguments() {
        return CommonUtils.toBytes(this.command + Character.MIN_VALUE, "UTF-16LE");
    }

    public String getFunction() {
        return "RunAsAdmin";
    }
}
