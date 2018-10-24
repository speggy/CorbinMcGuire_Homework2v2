package com.corbinmcguire.corbinmcguire_homework2;

public interface Command {
    void execute();
    void undo();
    void redo();
}
