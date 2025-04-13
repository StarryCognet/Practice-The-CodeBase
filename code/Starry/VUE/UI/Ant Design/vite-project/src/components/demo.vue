<template>
  <a-config-provider :theme="themeConfig">
    <div>
      <a-button type="primary">主要按钮</a-button>
      <a-button @click="toggleTheme">切换主题</a-button>
    </div>
  </a-config-provider>
</template>

<script>
import { defineComponent, reactive, toRefs } from 'vue';
import { theme } from 'ant-design-vue';

export default defineComponent({
  setup() {
    const state = reactive({
      themeMode: 'light', // 默认主题模式
    });

    const themeConfig = reactive({
      algorithm: theme.defaultAlgorithm, // 默认主题算法
    });

    const toggleTheme = () => {
      state.themeMode = state.themeMode === 'light' ? 'dark' : 'light';
      themeConfig.algorithm = state.themeMode === 'light' ? theme.defaultAlgorithm : theme.darkAlgorithm;
    };

    return {
      ...toRefs(state),
      themeConfig,
      toggleTheme,
    };
  },
});
</script>