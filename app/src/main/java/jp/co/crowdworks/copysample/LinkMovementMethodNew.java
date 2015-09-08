package jp.co.crowdworks.copysample;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;

public class LinkMovementMethodNew extends LinkMovementMethod {
    @Override
    public boolean canSelectArbitrarily() {
        return true;
    }

    public static MovementMethod getInstance() {
        if (sInstance == null)
            sInstance = new LinkMovementMethodNew();

        return sInstance;
    }

    private static LinkMovementMethodNew sInstance;
}

