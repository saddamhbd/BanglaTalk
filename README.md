# Bangla Talk — starter project

This is an early Android UI and signaling-server scaffold.

## Important status
- The Android screen is a starter UI only; the Call button is a demo placeholder.
- Real app-to-app audio calling is NOT implemented yet (no WebRTC media integration, authentication, push notifications, or TURN configuration).
- Calls to ordinary phone numbers/landlines require a lawful SIP/PSTN provider or gateway, provider credentials, billing, and applicable regulatory compliance.
- Do not deploy this prototype as a production calling service.

## GitHub build
Upload the contents of this folder to the root of the BanglaTalk repository, commit to `main`, then open Actions. Download the `BanglaTalk-debug-apk` artifact from the completed workflow.

## Signaling prototype
From `server`, run `npm install` then `npm start`. This server relays signaling events only; it does not carry voice audio.
