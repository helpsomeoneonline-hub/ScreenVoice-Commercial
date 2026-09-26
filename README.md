# ScreenVoice Commercial

Commercial test branch of the subtitle-to-voice reader.

The existing `AnimeVoiceReader-MVP` repository is intentionally left untouched.

## Test architecture

- Package: `com.screenvoice.reader`
- Subtitle modes planned: Auto, SubDL, OCR
- OCR: on-device ML Kit
- Test voice/subtitle credentials: injected at build time from GitHub Actions secrets
- Production release: credentials will move behind a backend service before public distribution

## GitHub Actions secrets used for test builds

- `SPEECHIFY_API_KEY`
- `SUBDL_API_KEY`

Do not commit API key values to this repository.
