package org.proxy;

public class ExecutorProxy implements CommandExecutor{

    private  CommandExecutor app;
    boolean isValid =false;

    @Override
    public void execute(String cmd) {

    }

    @Override
    public void execute(String cmd, String user, String key) {
        validateAccess( user, key);
        if (!isValid){
            throw new RuntimeException("invalid used access denied");
        }else {
            if(app==null){
                app=new Executor();
                app.execute(cmd);
            }
        }
    }


    private void validateAccess(String login, String pass) {
        if(login.equals("admin")&& pass.equals("s3cret"));{
            isValid= true;

        }

    }
}
