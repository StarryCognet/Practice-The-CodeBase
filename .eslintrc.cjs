module.exports = {
  // 其他配置...
  overrides: [
    {
      files: ['*.js', '*.jsx', '*.ts', '*.tsx'],
      plugins: ['eslint-plugin-i18n'],
      settings: {
        'eslint-plugin-i18n/i18n': {
          locale: 'zh-CN',
        },
      },
    },
  ],
  // 其他规则...
  // 其他配置...
  plugins: ['i18n'],
  rules: {
    'i18n': 'error',
  },
    // 其他规则...
};