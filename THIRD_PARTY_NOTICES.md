# Third-party services

## Google Cloud Text-to-Speech — Chirp 3 HD

ScreenVoice v0.7 can send recognized subtitle text to the user's Cloud Run service, which calls Google Cloud Text-to-Speech Chirp 3 HD and streams PCM audio back to the Android app.

No Google service-account key or Gemini API key is embedded in the APK. The Cloud Run endpoint URL is embedded for this personal test build.

Google Cloud usage and billing are governed by the user's Google Cloud project and Google Cloud terms.
